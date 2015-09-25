# include <stdio.h>
# include <stdlib.h>

# define MAX 1<<29

int count;
unsigned int A(unsigned int m, unsigned int n) {
    //static unsigned int count = 0;
    count++;
    if(count == MAX) {
        printf("Exceeded stack limit for m and n\n");
        exit(0);
    }
    if(m == 0) {
        return n+1;
    }
    if(n == 0)
        return A(m-1, 1);
    return A(m-1, A(m, n-1));
}

int main() {
    unsigned int m, n;
    printf("Type two positive integers as input :\n");
    //scanf("%d%d", &m, &n);
    count = 0;
    printf("%d\n", A(2, 2));
    printf("%d\n", count);
}
