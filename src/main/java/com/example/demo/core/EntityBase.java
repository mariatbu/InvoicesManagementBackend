package com.example.demo.core;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import java.util.UUID;

@MappedSuperclass
public @Getter @Setter @NoArgsConstructor abstract class EntityBase {
    
    @Id
    @Type(type="uuid-char")
    private UUID id;
    

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Object)){
            return false;
        }
        EntityBase tmp = (EntityBase)object;
        return tmp.id.equals(this.id);
    }

    @Override
    public int hashCode(){
        return this.id.hashCode();
    }
}
