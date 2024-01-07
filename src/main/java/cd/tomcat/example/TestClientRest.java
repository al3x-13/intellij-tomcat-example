package cd.tomcat.example;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TestClientRest {
    public static void main(String[] args) {
        executeGetStudent();
        System.out.println("\n----------------------------------------\n");
        executeUpdateName();
        System.out.println("\n----------------------------------------\n");
        executeGetAge();
    }

    private static void executeGetStudent() {
        try {
            URL url = new URL("http://localhost:8080/intellij-tomcat-example/rest/student/getStudent");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");

            Scanner scanner;
            String response;
            if (conn.getResponseCode() != 200) {
                scanner = new Scanner(conn.getErrorStream());
                response = "Error From Server \n\n";
            } else {
                scanner = new Scanner(conn.getInputStream());
                response = "Response From Server \n\n";
            }
            scanner.useDelimiter("\\Z");
            System.out.println("/getStudent response: " + response + scanner.next());
            scanner.close();
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void executeUpdateName() {
        try {
            URL url = new URL("http://localhost:8080/intellij-tomcat-example/rest/student/updateName");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            String input = "{\"name\":\"mark\",\"age\":21}";

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            Scanner scanner;
            String response;
            if (conn.getResponseCode() != 200) {
                scanner = new Scanner(conn.getErrorStream());
                response = "Error From Server \n\n";
            } else {
                scanner = new Scanner(conn.getInputStream());
                response = "Response From Server \n\n";
            }
            scanner.useDelimiter("\\Z");
            System.out.println("'/updateName' response: " + response + scanner.next());
            scanner.close();
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void executeGetAge() {
        try {
            URL url = new URL("http://localhost:8080/intellij-tomcat-example/rest/student/getAge");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            String input = "{\"name\":\"mark\",\"age\":21}";

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            Scanner scanner;
            String response;
            if (conn.getResponseCode() != 200) {
                scanner = new Scanner(conn.getErrorStream());
                response = "Error From Server \n\n";
            } else {
                scanner = new Scanner(conn.getInputStream());
                response = "Response From Server \n\n";
            }
            scanner.useDelimiter("\\Z");
            System.out.println("'/getAge' response: " + response + scanner.next());
            scanner.close();
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
