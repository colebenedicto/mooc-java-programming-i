/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Archive {
    private String indentifier;
    private String name;

    public Archive(String indentifier, String name) {
        this.indentifier = indentifier;
        this.name = name;
    }

    public String getIndentifier() {
        return indentifier;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Archive)) {
            return false;
        }
        
        Archive thisArchive = (Archive) compared;
        
        if (this.indentifier.equals(thisArchive.indentifier)) {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.indentifier + ": " + this.name;
    }
    
    
}
