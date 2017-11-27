/**
 * 
 */
package home_xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Lxy E-mail:1466281805@qq.com
 * @version ����ʱ�䣺2017��10��13������5:57:27
 * ��˵��
 */
public class dom_xml {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			DocumentBuilderFactory bdf = DocumentBuilderFactory.newInstance();//���ȴ���һ��DocementBu
			DocumentBuilder db = bdf.newDocumentBuilder();//���һ��	DocumentBuilder����
		    Document document = db.parse("book.xml");//DocumentBuilder��parse������ȡ·���ļ�
			NodeList bl = document.getElementsByTagName("book");//���xml�ļ�����
			System.out.println("һ���У�"+bl.getLength()+"����");
			for(int i = 0; i < bl.getLength(); i++){
				System.out.println("*****��ʼ��"+(i+1)+"������б�������ȡ���ǵĻ�������");
				Node b = (Node) bl.item(i);//ͨ��item()������NodeList���ϻ�ȡ����
			    Element b_da = (Element)bl.item(i);
			    String atrrid =b_da.getAttribute("id");
			    System.out.println("id�����Ե�ֵ�ǣ�"+atrrid);
			    String atrr_ty =b_da.getAttribute("type");
			    System.out.println("type�����Ե�ֵ�ǣ�"+atrr_ty);
		   
			    NodeList b_daList = b.getChildNodes();
			    //System.out.println("�ӽڵ��ֵ�ǣ�"+b_daList.getLength());
			   for (int k = 0; k < b_daList.getLength(); k++) {
				if(b_daList.item(k).getNodeType() == Node.ELEMENT_NODE)
				{
					System.out.println("�ڵ���Ϊ��" + b_daList.item(k).getNodeName());
					System.out.println("�ڵ�ֵΪ��" + b_daList.item(k).getFirstChild().getNodeValue());
					
				}
				
			}
			System.out.println("��������"+(i+1)+"�������Ϣ");	
			}	
				
		} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
