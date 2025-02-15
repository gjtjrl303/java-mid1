package exception.ex4;

import exception.ex4.NetworkClientV4;

public class NetworkServiceV4 {

    public void sendMessage(String data)  {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); // 추가

        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}
