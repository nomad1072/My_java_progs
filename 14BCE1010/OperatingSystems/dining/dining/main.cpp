//
//  main.cpp
//  dining
//
//  Created by LANKA SAI SIDDHARTH on 3/27/16.
//  Copyright © 2016 LANKA SAI SIDDHARTH. All rights reserved.
//

#include<iostream>
#include<pthread.h>
#include<semaphore.h>
sem_t stick[4];
void* func(void* i)
{
    
    int *tem=(int*)i;
    
    int temp=*tem;
    
    sem_wait(&stick[temp]);
    sem_wait(&stick[(temp+1)%4]);
    printf("Philosopher %d is eating\n",temp);
    sleep(1);
    sem_post(&stick[(temp+1)%4]);
    
    sem_post(&stick[temp]);
    printf("Philosopher %d is thinking\n",temp);
    
}

int main()
{
    int n,j;
    
    
    for(j=0;j<4;j++)
        sem_init(&stick[j],0,1);
    
    pthread_t phil[4];
    for(j=0;j<4;j++)
        pthread_create(&phil[j],NULL,func,&j);
    
    for(j=0;j<4;j++)
        pthread_join(phil[j],NULL);
    
    for(j=0;j<4;j++)
        sem_destroy(&stick[j]);
    
    
    return 0;
}

