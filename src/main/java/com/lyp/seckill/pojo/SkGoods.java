package com.lyp.seckill.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lyp
 * @since 2022-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SkGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品标题
     */
    private String goodsTitle;

    /**
     * 商品图片
     */
    private String goodsImg;

    /**
     * 商品详情
     */
    private String goodsDetail;

    private BigDecimal goodsPrice;

    /**
     * 商品库存，-1表示没有限制
     */
    private Integer goodsStock;


}
