package cap.dao;

import java.util.HashMap;

import cap.bean.MyBean;

public class MyDao {
MyBean obj=new MyBean();
HashMap<Long,MyBean>hm=new HashMap<Long, MyBean>();

HashMap<MyTransaction,Long> hm1=new HashMap<MyTransaction,Long>();//for transaction
public void addAccount(MyBean obj)
{
	this.obj=obj;
	hm.put(obj.getAccNo(), obj);
	
}
public HashMap<Long, MyBean> hm()
{		                                       
	return hm;
}
 public HashMap<MyTransaction,Long>hm1()
{
	return hm1;
	
}


}
