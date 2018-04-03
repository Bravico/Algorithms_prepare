package others;

/**
 * Ref: https://blog.csdn.net/u014727260/article/details/55003402
 * @author Yel
 * 介绍浅拷贝和深拷贝
 * 完全深拷贝可以用Serializable的输入输出流实现
 *
 */
public class CloneExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// copyReferenceObject();
//		copyRealObject();
		
		 Body body = new Body(new Head());

		    Body body1 = (Body) body.clone();

		    System.out.println("body == body1 : " + (body == body1) );

		    System.out.println("body.head == body1.head : " +  (body.head == body1.head));
	}

	/**
	 * 引用拷贝 Result is below true true p:others.Person@33909752
	 * p1:others.Person@33909752
	 */
	private static void copyReferenceObject() {
		Person p = new Person(23, "huang");
		Person p1 = p;
		System.out.println(p == p1);
		System.out.println(p.equals(p1));
		System.out.println("p:" + p);
		System.out.println("p1:" + p1);
	}

	/**
	 * 浅拷贝，包含对象的拷贝 
	 * false 
	 * false 
	 * others.Person@33909752 
	 * others.Person@55f96302
	 * pName:99628461 
	 * p1Name:99628461
	 * 
	 * @throws CloneNotSupportedException
	 */
	private static void copyRealObject() throws CloneNotSupportedException {
		Person p = new Person(24, "huang");
		Person p1 = (Person) p.clone();
		System.out.println(p == p1);
		System.out.println(p.equals(p1));
		System.out.println(p);
		System.out.println(p1);
		// Notice the print-out of hashCode
		System.out.println("pName:" + p.getName().hashCode());
		System.out.println("p1Name:" + p1.getName().hashCode());
	}

}

class Person implements Cloneable {
	private Integer age;
	private String name;

	public Person(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
class Body implements Cloneable{
	public Head head;

    public Body() {}

    public Body(Head head) {this.head = head;}

    @Override
    protected Object clone() throws CloneNotSupportedException {
    		
        Body newBody = (Body)super.clone();
        newBody.head = (Head) head.clone();
        return newBody;
    }
}

class Head implements Cloneable{
	public Head() {}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

class Person1 implements Cloneable {
	private  Head head;
}