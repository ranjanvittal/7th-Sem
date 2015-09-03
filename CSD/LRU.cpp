# include <iostream>
# include <stdio.h>
# include <set>
# include <vector>
using namespace std;
# define MAX 1000000007

set<int> all_seen;

class CacheTree {
    int associativity;
    vector <int> block_nodes;
    vector <bool> flippers;
    public:
        void initialize(int n) {
            int i;
            associativity = n;
            block_nodes = vector <int> (n);
            flippers = vector<bool> (n-1);
            for(i = 0; i < n-1; i++)
                flippers[i] = false;
            for(i = 0; i < n; i++)
                block_nodes[i] = -1;
        }

        bool access(int block_number) {
            int i;
            for(i = 0; i < associativity; i++)
                if(block_nodes[i] == block_number)
                    return turn_away(i);
            return emplace(block_number);
        }

        bool turn_away(int index) {
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

        bool emplace(int block_number) {
            int index = 0;
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
    int set_bitmasker;
    int block_bitmasker;
    int conflict_miss;
    int cache_access;
    int bits;
    public:
        PseudoCache(int cache_size, int block_size, int associativity) {
            int per_set = associativity*block_size;
            int number_of_sets = cache_size/per_set;
            int number_of_blocks = ((1<<30)/block_size) << 2;
            conflict_miss = 0;
            cache_access = 0;
            cache = vector < CacheTree >(number_of_sets);

            int i;
            for(i = 0; i < number_of_sets; i++) {
                cache[i].initialize(associativity);
            }
            set_bitmasker = -(((1 << 30)/number_of_sets) << 2);
            block_bitmasker = -block_size;
            bits = 0;
            while(number_of_sets > 0) {
                number_of_sets >>= 1;
                bits++;
            }
            bits = 33-bits;
        }
        void access(int address) {
            CacheTree required = cache[ (address&set_bitmasker) >> bits];
            bool is_found = required.access(address&block_bitmasker);
            if(!is_found && (all_seen.find(address) == all_seen.end()))
                conflict_miss++;
            all_seen.insert(address);
            cache_access++;
        }

};

int main(int argc, char** argv) {
    int cache_size;
    int block_size;
    int associativity;
    cache_size = atoi(argv[1]);
    block_size = atoi(argv[2]);
    associativity = atoi(argv[3]);
    PseudoCache pc(cache_size, block_size, associativity);
}
