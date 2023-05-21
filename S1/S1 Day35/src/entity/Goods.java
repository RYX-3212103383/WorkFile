package entity;

import lombok.Data;

@Data
public class Goods {
	/**
	 * 商品id，自增长
	 */
	private Integer goodsId;
	/**
	 * 商品名称
	 */
	private String name;
	/**
	 * 条形码
	 */
	private String barcode;
	/**
	 * 价格
	 */
	private Double price;
	/**
	 * 数量
	 */
	private Integer number;
	/**
	 * 位置编号（外键)
	 */
	private Integer positionId;
	/**
	 * 类别编号（外键）
	 */
	private Integer kindId;

}
