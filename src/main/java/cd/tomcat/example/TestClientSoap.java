package cd.tomcat.example;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class TestClientSoap {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean authFactory = new JaxWsProxyFactoryBean();
        // especificar endpoint do serviço
        authFactory.setAddress("http://localhost:8080/intellij-tomcat-example/mathUtilitySoap");
        // especificar interface do serviço
        authFactory.setServiceClass(MathUtility.class);
        // criar serviço
        MathUtility mathUtility = (MathUtility) authFactory.create();

        // executar as funções do serviço
        int resultAddInteger = mathUtility.addIntegers(4, 3);
        int resultFactorial = mathUtility.factorial(7);

        // listar resultados
        System.out.println("Resultado addIntegers(4, 3): " + resultAddInteger);
        System.out.println("Resultado factorial(7): " + resultFactorial);
    }
}
