#include <stdio.h>
#include <stdlib.h> // exit
#include <unistd.h> // fork, getpid

int main(int argc, char *argv[])
{
    int a;
    int b;
    char oper;
    scanf("%d %c %d", &a, &oper, &b);
    printf("hello world (pid:%d)\n", (int) getpid());
    
    if(oper == '+'){
        printf(a+b);
    }
    else if (oper=='-'){
        printf(a-b);
    }
    else if (oper=='*')
    {
        printf(a*b);
    }
    else{
        printf(a/b);
    }
    
    return 0;
}
