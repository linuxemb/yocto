#include <stdio.h>

int main (int argc, char *argv[]) {
	printf("Hello, Yocto \"%s\"\n", argv[0]);
	printf("Hello,again Yocto \"%s\"\n", argv[0]);
	printf("Hello,test AUTOREV \"%s\"\n", argv[0]);
	printf("Hello,test PV+SRCRV \"%s\"\n", argv[0]);
	printf("Hello,test PV+SRCRV \"%s\"\n", argv[0]);
	return 0;
}

