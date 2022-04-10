/*
 ============================================================================
 Name        : 2DARRAYSUM.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int a[50][50],b[50][50],limit,i,j,sum[50][50];
	setbuf(stdout,NULL);
	printf("Enter the size of arrays");
	scanf("%d",&limit);
	printf("Enter the values of array 1");
	for(i=0;i<limit;i++){
		for(j=0;j<limit;j++){
		scanf("%d",&a[i][j]);
	}

	}
	printf("Enter the values of array 2");
		for(i=0;i<limit;i++){
			for(j=0;j<limit;j++){
			scanf("%d",&b[i][j]);
		}

		}
		for(i=0;i<limit;i++){
			for(j=0;j<limit;j++){
		sum[i][j]=a[i][j]+b[i][j];}
		}
		printf(" Sum of 2 arrays is:");
		for(i=0;i<limit;i++){
			printf("\n");
			for(j=0;j<limit;j++){
		    printf("%d\t",sum[i][j]);

		}
		}



	return EXIT_SUCCESS;
}
