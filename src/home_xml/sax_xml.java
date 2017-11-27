/**
 * 
 */
package home_xml;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



/**
 * @author Lxy E-mail:1466281805@qq.com
 * @version 创建时间：2017年10月13日下午6:18:40
 * 类说明
 */
public class sax_xml extends DefaultHandler{
	int temp=0;
	String value;
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		 value  = new String (ch, start, length);
		if (!value.trim().equals("")) {
			System.out.println("节点值为："+ value);
			
	}
	}

	

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("结束解析xml文件！");
	}

	@Override
	public void endElement(String url, String locname, String qname)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(url, locname, qname);
		if(qname.equals("book")){
			
			System.out.println("*****结束对"+temp+"本书进行遍历");
		}
		
			
		}
		
	
 
	@Override
	public void startElement(String url, String locname, String qname,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		
		super.startElement(url, locname, qname, attributes);
		if(qname.equals("book")){
			temp ++;
			System.out.println("*****开始对"+temp+"本书进行遍历，获取他们的基本属性");
			int a = attributes.getLength();
			System.out.println("属性个数：" + a);
			for (int i = 0; i < a; i++) {
				System.out.println("第"+temp+"本书的属性名：" + attributes.getQName(i));
				System.out.println("第"+temp+"朵花的属性值：" + attributes.getValue(i));
				
			}
		}
		else if(!qname.equals("flower")&&!qname.equals("flowerstore"))
				{
					System.out.println("节点名："+qname);
				}
			
		
		
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("开始解析xml文件！");
	}
	

}
