package com.singleton;
public class ThreadSafeDoubleCheckedLockingSingleton {

    private static ThreadSafeDoubleCheckedLockingSingleton instance;
    
    private ThreadSafeDoubleCheckedLockingSingleton(){}
    
    public static ThreadSafeDoubleCheckedLockingSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeDoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
    
}