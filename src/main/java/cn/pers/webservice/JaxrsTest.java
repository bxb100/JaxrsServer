package cn.pers.webservice;

import cn.pers.domain.Car;
import cn.pers.domain.User;
import cn.pers.service.impl.UserServiceImpl;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.JAXRSServiceFactoryBean;

/**
 * Created by JohnBi on 2017/11/15. 23:07
 *
 * @author Lemon
 */
public class JaxrsTest {
    public static void main(String[] args) {
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

        factory.setResourceClasses(Car.class, User.class);
        factory.setAddress("http://localhost:12345/");
        factory.setServiceBean(new UserServiceImpl());

        factory.create();

    }
}
