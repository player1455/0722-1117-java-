package org.example.springformysql.util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchAlgorithmException;

public class Md5util {
    /**
     * 使用 MD5 加密密码
     *
     * @param password 原始密码字符串
     * @return 加密后的 MD5 哈希值
     * @throws IllegalArgumentException 如果输入密码为空
     */
    public static String getMD5String(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }

        try {
            // 获取 MD5 消息摘要实例
            MessageDigest md = MessageDigest.getInstance("MD5");

            // 计算 MD5 哈希值
            byte[] hashBytes = md.digest(password.getBytes());

            // 将字节数组转换为十六进制字符串
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xFF & b);
                if (hex.length() == 1) {
                    hexString.append('0'); // 保证每个字节两位
                }
                hexString.append(hex);
            }

            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm not found", e);
        }
    }

    // 示例用法
    public static void main(String[] args) {
        try {
            String rawPassword = "mySecurePassword123";
            String hashedPassword = getMD5String(rawPassword);
            System.out.println("Original Password: " + rawPassword);
            System.out.println("Hashed Password: " + hashedPassword);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
