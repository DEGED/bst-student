package model;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private Student root;
	
	public Course() {
		
	}
	public void addStudent(int c, String n) {
		Student newStudent = new Student(c, n);
		if(root == null) {
			root = newStudent;
		}else {
			Student current = root;
			while(current != null) {
				if(current.compareTo(newStudent)>0) {
					if(current.getRigth() == null) {
						current.setRigth(newStudent);
					}else {
						current = current.getRigth();
					}
				}else if(current.compareTo(newStudent)<0) {
					if(current.getLeft() == null) {
						current.setLeft(newStudent);
					}else {
						current = current.getLeft();
					}
				}else {
					if(current.getLeft() == null) {
						current.setLeft(newStudent);
					}else {
						current = current.getLeft();
					}
				}
				
			}
		}
	}
	
	public Student searchStudent(int c) {
		Student searched = null;
		Student current = root;
		boolean found = false;
		while(current.getCode() != c  && found) {
			if(current.getCode() < c) {
				if(current.getLeft() == null) {
					found = true;
				}
				current = current.getLeft();
			}else if(current.getCode() > c) {
				if(current.getRigth() == null) {
					found = true;
				}
				current = current.getRigth();
			}else {
				searched = current;
				found = true;
			}
		}
		return searched;
	}
	
	public List<Student> preOrder(){
		return preOrder(root);
	}
	private List<Student> preOrder(Student currentNode){
		List<Student> l = new ArrayList<>();
		if(currentNode != null){
			l.add(currentNode);
			List<Student> ll = preOrder(currentNode.getLeft());
			List<Student> lr = preOrder(currentNode.getRigth());
			l.addAll(ll);
			l.addAll(lr);
		}
		return l;
	}
	public List<Student> preOrder2(){
		List<Student> l = new ArrayList<>();
		preOrder2(root, l);
		return l;
	}
	private List<Student> preOrder2(Student x, List<Student> y){
		if(x!=null) {
			
			Student l = x.getLeft();
			Student r = x.getRigth();
			y.add(l);
			y.add(r);
			return preOrder2(x,y);
		}
		return y;
	}
	public List<Student> postOrder(){
		return postOrder(root);
	}
	private List<Student> postOrder(Student current){
		List<Student> l = new ArrayList<Student>();
		if(current != null) {
			l.add(current);
			List<Student> ll = postOrder(current.getLeft());
			List<Student> r = postOrder(current.getRigth());
			l.addAll(ll);
			l.addAll(r);
		}
		return l;
	}
}
