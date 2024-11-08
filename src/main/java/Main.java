//package week_7_task_demo;

import service.HttpServerServiceImpl;

import static common.SimpleHttpServer.PORT;

public class Main {
    public static void main(String[] args) {

        HttpServerServiceImpl service = new HttpServerServiceImpl();

        service.start(PORT);
    }
}
