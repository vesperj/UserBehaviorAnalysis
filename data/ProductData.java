package com.vesper.data;

import java.lang.reflect.Array;
import java.util.UUID;

/**
 * 用于生成数据
 * 字段信息
 * 1.data：日期
 * 2.user_id:用户
 * 3.session_id:会话
 * 4.page_id页面
 * 5.action_time:时间点
 * 6.search_keyword:关键词
 * 7.click_category_id:首页点击品类
 * 8.click_product_id:列表点击商品
 * 9.order_category_ids:购物车中的直接下单的商品品类
 * 10.order_product_ids:下单的商品列表
 * 11.pay_category_ids:支付中对应的品类
 * 12.pay_product_ids:支付中具体的商品
 */
public class ProductData {

    /**
     * 时间
     */
    public static String date;
    /**
     * 用户ID
     */
    public static int user_id;
    /**
     * 会话ID
     */
    public static String session_id;
    /**
     * 页面ID
     */
    public static int page_id;
    /**
     * 某一天的日期+随机生成的小时+分钟+秒
     * 2017-12-10 3:56:48
     */
    public static String action_time;
    /**
     * 关键词
     */
    public static String[] search_keyword =
            {"1", "2", "3", "4", "5",
                    "6", "7", "8", "9", "10",
                    "11", "12", "13", "14", "15",
                    "16", "17", "18", "19", "20"};
    /**
     * 首页点击品类
     */
    public static int clivk_vstrgory_id;
    /**
     * 列表点击商品
     */
    public static int click_product_id;
    /**
     * 购物车中直接下单的商品品类
     */
    public static Array[] order_category_ids;
    /**
     * 下单的商品列表
     */
    public static Array[] order_product_ids;
    /**
     * 支付中对应的品类
     */
    public static Array[] pay_category_ids;
    /**
     * 支付中具体的商品
     */
    public static Array[] pay_product_ids;

    public static String getSearch_Word() {
        int index = (int) (Math.random() * search_keyword.length);
        return search_keyword[index];
    }

    public static UUID getSession_id() {
        return java.util.UUID.randomUUID();
    }

    public static String getAction_time() {
        String time = (int) (Math.random() * 24) + ":" + (int) (Math.random() * 60) + ":" + (int) (Math.random() * 60);
        return time;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(getSession_id());
            System.out.println(getAction_time());
            System.out.println(getSearch_Word());
        }
    }
}
