package com.rs.game;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * 
 * @author hc747
 *
 */

public final class EntityList<E extends Entity> extends AbstractList<E> implements List<E>, Serializable {
	
	private static final long serialVersionUID = 3862865273642234877L;
	
	private Entity [] nodes;
	private int lowestFreeIndex, size;
	
	@SuppressWarnings("hiding")
	public <E extends Entity> EntityList(int capacity) {
		nodes = new Entity[capacity];
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public E[] toArray() {
		return (E[]) Arrays.copyOf(nodes, size);
	}
	
    @SuppressWarnings({ "hiding", "unchecked" })
    @Override
	public <E> E[] toArray(E[] a) {
        if (a.length < size)
            return (E[]) Arrays.copyOf(nodes, size, a.getClass());
        System.arraycopy(nodes, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }
	
    @Override
	public boolean add(E entity) {
		if (entity == null || size + 1 > nodes.length)
			return false;
		synchronized (this) {
			entity.setIndex(lowestFreeIndex + 1);
			nodes[lowestFreeIndex] = entity;
			size++;
			for (int i = lowestFreeIndex + 1; i < nodes.length; i++) {
				if (nodes[i] == null) {
					lowestFreeIndex = i;
					break;
				}
			}
			return true;
		}
	}
    
    @Override
    public E remove(int index) {
    	synchronized (this) {
    		if (nodes[index] != null) {
    			E entity = (E) nodes[index];
    			nodes[index] = null;
    			size--;
    			if (index < lowestFreeIndex)
					lowestFreeIndex = index;
    			return entity;
    		}
    		return null;
    	}
    }
    
	public E remove(E entity) {
		return remove(entity.getIndex() - 1);
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		if (index < 1 || index > nodes.length)
			return null;
		return (E) nodes[index - 1];
	}
	
	public boolean contains(E entity) {
		return entity != null && entity.getIndex() > 0 && nodes[entity.getIndex() - 1] == entity;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Iterator<E> iterator() {
		return new EntityIterator();
	}
	
	private final class EntityIterator implements Iterator<E> {
		
		private int previous = -1, index = 0;

		@Override
		public boolean hasNext() {
			for (int i = index; i < nodes.length; i++) {
				if (nodes[i] != null) {
					index = i;
					return true;
				}
			}
			return false;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			E entity = null;
			for (int i = index; i < nodes.length; i++) {
				if (nodes[i] != null) {
					entity = (E) nodes[i];
					index = i;
					break;
				}
			}
			if (entity == null)
				throw new NoSuchElementException();
			previous = index++;
			return entity;
		}

		@SuppressWarnings("unchecked")
		@Override
		public void remove() {
			if (previous == -1)
				throw new IllegalStateException();
			EntityList.this.remove((E) nodes[previous]);
			previous = -1;
		}
		
	}
	
}