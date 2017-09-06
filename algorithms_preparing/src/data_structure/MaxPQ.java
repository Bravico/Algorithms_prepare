package data_structure;

import java.awt.RenderingHints.Key;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MaxPQ<E extends Comparable<E>> implements Iterable<E> {
	
	private E[] pq;
	private int size = 0; //default value
	private Comparator<E> comparator;
	
	@SuppressWarnings("unchecked")
	public MaxPQ(int capacity){
		pq = (E[]) new Object[capacity+1];
	}
	
	public MaxPQ(){
		this(1);
	}
	
	public MaxPQ(int capacity, Comparator<E> comparator){
		pq = (E[]) new Object[capacity+1];
		this.comparator = comparator;
	}
	
	public MaxPQ(E[] e){
		size = e.length;
		pq = (E[]) new Object[size+1];
		for(int i=0;i<size;i++){
			pq[i+1] = e[i];
		}
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	--------------------basic--------------------------
//	--------------------Function---------------------
	public void insert(E e){
		pq[++size] = e;
		swim(size);
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int size(){
		return size;
	}
	
	public E deleleteMax(){
		E max = pq[1];
		swap(pq, 1, size--);
		pq[size] = null;
		sink(1);
		return max;
	}
	
	
//	--------------------Heap--------------------------
//	--------------------execution---------------------
	private void swim(int k){
		while(k>1 && less(k/2, k)){
			swap(pq, k/2, k);
			k = k/2;
		}
	}
	
	/**
	 * sink the k Heap element 
	 * @param k the location of sink element
	 */
	private void sink(int k){
		while(k*2<size){
			int j = k*2;
			if(j<size && less(j, j+1)) j++;
			swap(pq, k, j);
			k = j;
		}
	}
	
//	--------------------General-----------------------
//	--------------------execution---------------------
	private boolean less(int i, int j){
		return pq[i].compareTo(pq[j])<0;
	}
	
	private boolean more(int i, int j){
		return pq[i].compareTo(pq[j])>0;
	}
	
	private void swap(Comparable[] a,int i, int j){
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
