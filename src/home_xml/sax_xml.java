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
 * @version ����ʱ�䣺2017��10��13������6:18:40
 * ��˵��
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
			System.out.println("�ڵ�ֵΪ��"+ value);
			
	}
	}

	

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("��������xml�ļ���");
	}

	@Override
	public void endElement(String url, String locname, String qname)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(url, locname, qname);
		if(qname.equals("book")){
			
			System.out.println("*****������"+temp+"������б���");
		}
		
			
		}
		
	
 
	@Override
	public void startElement(String url, String locname, String qname,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		
		super.startElement(url, locname, qname, attributes);
		if(qname.equals("book")){
			temp ++;
			System.out.println("*****��ʼ��"+temp+"������б�������ȡ���ǵĻ�������");
			int a = attributes.getLength();
			System.out.println("���Ը�����" + a);
			for (int i = 0; i < a; i++) {
				System.out.println("��"+temp+"�������������" + attributes.getQName(i));
				System.out.println("��"+temp+"�仨������ֵ��" + attributes.getValue(i));
				
			}
		}
		else if(!qname.equals("flower")&&!qname.equals("flowerstore"))
				{
					System.out.println("�ڵ�����"+qname);
				}
			
		
		
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("��ʼ����xml�ļ���");
	}
	

}
