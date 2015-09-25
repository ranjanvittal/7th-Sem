# include <iostream>
# include <stdio.h>
# include <set>
# include <vector>
# include <cstdlib>

using namespace std;

# define MAX 1000000007

typedef long long ll;

set<ll> all_seen;

class CacheTree {
    ll associativity;
    vector <ll> block_nodes;
    vector <bool> flippers;
    public:
    void initialize(ll n) {
        ll i;
        associativity = n;
        block_nodes = vector <ll> (n);
        flippers = vector<bool> (n-1);
        for(i = 0; i < n-1; i++)
            flippers[i] = false;
        for(i = 0; i < n; i++)
            block_nodes[i] = -1;
    }

    bool access(ll block_number) {
        ll i;
        for(i = 0; i < associativity; i++)
            if(block_nodes[i] == block_number)
                return turn_away(i);
        return emplace(block_number);
    }

    bool turn_away(ll index) {
        index += associativity-1;
        while(index > 0) {
            if(index % 2)
                flippers[index>>1] = true;
            else
                flippers[index>>1] = false;
            index >>= 1;
        }
        return true;
    }

    bool emplace(ll block_number) {
        ll index = 0;
        while(index < associativity-1) {
            flippers[index] = !flippers[index];
            if(flippers[index])
                index = 2*index + 1;
            else
                index = 2*index + 2;
        }
        index -= (associativity-1);
        block_nodes[index] = block_number;
        return false;
    }

};

class PseudoCache {
    vector < CacheTree > cache;
    ll set_shifter;
    ll block_shifter;
    ll conflict_miss;
    ll cache_access;
    ll get_set(ll address) {
        ll ret = (address & set_shifter);
        ll bl = block_shifter;
        while (bl > 0) {
            ret /= 2;
            bl /= 2;
        }
        return ret;
    }
    ll get_block(ll address) {
        ll ret = (address & (~block_shifter));
        return ret;
    }
 public:
    void ConflictMissRate() {
        cout << "Total accesses = " << cache_access << endl;
        cout << "Total misses = " << conflict_miss << endl;
        if (cache_access > 0) cout << "Miss rate = " << (static_cast<double>(conflict_miss) / cache_access) << endl;
        else cout << "No accesses to miss" << endl;
        return;
    }

    PseudoCache(ll cache_size, ll block_size, ll associativity) {
        ll per_set = associativity*block_size;
        ll number_of_sets = cache_size/per_set;

        ll si = 1;
        for (int i = 0; i < 62; ++ i) si *= 2;
        ll number_of_blocks = ((si)/block_size) << 2;
        conflict_miss = 0;
        cache_access = 0;
        cache = vector < CacheTree >(number_of_sets);

        ll i;
        for(i = 0; i < number_of_sets; i++) {
            cache[i].initialize(associativity);
        }
        set_shifter = 0;
        while(number_of_sets / 2 != 0) {
            set_shifter *= 2;
            set_shifter ++;
            number_of_sets /= 2;
        }
        block_shifter = 0;
        while(block_size / 2 != 0) {
            block_shifter *= 2;
            block_shifter ++;
            set_shifter *= 2;
            block_size /= 2;
        }
    }

    void access(ll address) {
        ll set_index = get_set(address);
        ll block_index = get_block(address);
        bool is_found = cache[set_index].access(block_index);
        if((!is_found) && (all_seen.find(address) != all_seen.end()))
            conflict_miss++;
        all_seen.insert(address);
        cache_access++;
    }

};

int main(int argc, char** argv) {
    ll cache_size;
    ll block_size;
    ll associativity;
    cache_size = atoi(argv[1]);
    block_size = atoi(argv[2]);
    associativity = atoi(argv[3]);
    PseudoCache pc(cache_size, block_size, associativity);
    ll inp;
    cin >> inp;
    while (inp != 0) {
        pc.access(inp);
        cin >> inp;
    }
    pc.ConflictMissRate();
}
