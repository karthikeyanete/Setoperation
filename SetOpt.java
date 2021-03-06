package org.creators.coll;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class SetOpt<E> {
	
    private Set<E> set;
    
    public SetOpt() {
        this.set = new TreeSet<E>();
    }
    public SetOpt(Collection<E> set) {
        this.set = (Set<E>) set;
    }
    public int size() {
        return this.set.size();
    }
    public boolean isEmpty() {
        return this.set.isEmpty();
    }
    public void clear() {
        this.set.clear();
    }
    public boolean contains(Object o) {
        return this.set.contains(o);
    }
    public void remove(Object o) {
        this.set.remove(o);
    }
    public void add(E e) {
        this.set.add(e);
    }
    public SetOpt<E> union(SetOpt<E> b,SetOpt<E> a) {
    	Set<E> copy1 = new TreeSet<E>(this.set);
    	Set<E> copy2 = new TreeSet<E>(b.set);
        SetOpt<E> tmp = new SetOpt<E>();
        copy1.addAll(copy2);
        tmp.set = copy1;
        return tmp;
    }
    public SetOpt<E> intersection(SetOpt<E> b,SetOpt<E> a) {
        SetOpt<E> tmp = new SetOpt<E>();
	tmp.set.addAll(a.set);
	tmp.set.removeAll(a.set);
        return tmp;
    }

      public  SetOpt<E> difference(SetOpt<E> setA, SetOpt<E> setB) {
        SetOpt<E> tmp = new SetOpt<E>();
        tmp.set.removeAll(setB.set);
        return tmp;
      }

      public  SetOpt<E> symDifference(SetOpt<E> setA, SetOpt<E> setB) {
        
        SetOpt<E> tmpA = new SetOpt<E>();
        SetOpt<E> tmpB = new SetOpt<E>();
        tmpA = union(setA, setB);
        tmpB = intersection(setA, setB);
        return difference(tmpA, tmpB);
      }

     
	public String toString() {
		return ""+set;
	}
  
	
}
