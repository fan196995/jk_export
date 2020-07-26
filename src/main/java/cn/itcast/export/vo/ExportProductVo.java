package cn.itcast.export.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import cn.itcast.export.domain.ExportProduct;

/**
 * @Description:	ExportProductService接口
 * @Author:			传智播客 java学院	传智宋江
 * @Company:		http://java.itcast.cn
 * @CreateDate:		2016-7-7 0:05:42
 */
@XmlRootElement(name="exportProduct")
public class ExportProductVo extends ExportProduct {

}
