package com.example.demo.core;

import com.example.demo.core.functionalinterfaces.FindById;

public abstract class ApplicationBase<T,ID> {

    private FindById<T, ID> findById;

    //TODO: throw my NotFoundException
    protected T findById(ID id){
        T t = this.findById.findById(id).orElseThrow();
        return t;
    }

    protected ApplicationBase(FindById<T, ID> findById){
        this.findById = findById;
    }

    protected String serializeObject(T entity, String message){
        return String.format(" %s %s successfully.", entity.toString(), message);
    }
    
}
