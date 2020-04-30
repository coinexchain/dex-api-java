package org.coinex.dex.client.context;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHelper {

    public static void createFile(String pathStr) throws IOException {
        Path path = Paths.get(pathStr);
        boolean isExist = Files.exists(path, LinkOption.NOFOLLOW_LINKS);
        if (!isExist) {
            Files.createFile(path);
        }
    }

    public static void write(String file, String text) {
        FileOutputStream fos = null;
        FileChannel channel = null;
        try {
            fos = new FileOutputStream(file);
            channel = fos.getChannel();
            byte[] array = text.getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(array);
            channel.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                channel.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
