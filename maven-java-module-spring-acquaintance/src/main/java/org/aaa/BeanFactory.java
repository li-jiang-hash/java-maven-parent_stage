package org.aaa;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:江Sir
 * @Date:01 2022/09/01 08:34
 * @description: Exercise
 * @Version 1.0.0
 */
public class BeanFactory { /* 声明集合用来保存bean  */
    private static Map<String, Object> ioc = new HashMap<>();

    static {
        try {      /* 1.读取配置文件 */
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.xml");      /* 2.解析xml */
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(in);      /* 3.编写xpath表达式 */
            String xpath = "//bean";      /* 4.获取所有的bean标签 */
            List<Element> list = document.selectNodes(xpath);      /* 5.遍历并创建对象实例，设置到map集合中 */
            for (Element element : list) {
                String id = element.attributeValue("id");
                String className = element.attributeValue("class");
                Object object = Class.forName(className).newInstance();
                ioc.put(id, object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  // 获取指定id的对象实例

    public static Object getBean(String beandId) {
        return ioc.get(beandId);
    }
}
