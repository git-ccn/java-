package com.company.jianzao;/*
 *开发人员                 ：陈诺
 *开发人学号               ：2019110502
 *开发时间                 ：2021-09-25
 */

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean() {
        try {
            DocumentBuilderFactory  dF = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dF.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src//confing.xml"));

            NodeList nl = doc.getElementsByTagName("ClassName");
            Node ClassNode = nl.item(0).getFirstChild();
            String cName = ClassNode.getNodeValue();

            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

