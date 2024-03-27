package com.caolei.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        String str = "哈肯定会港口建设经费哈哈哈哈哈见识到了咖啡碱阿斯利康进口的施工i啊傻瓜OK卡撒打发法施工";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes);
        fos.close();
    }
}
