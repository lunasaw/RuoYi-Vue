package com.luna.product.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.luna.product.domain.Brand;

/**
 * 品牌Mapper接口
 * 
 * @author luna
 * @date 2022-05-01
 */
public interface BrandMapper extends BaseMapper<Brand> {
    /**
     * 查询品牌
     * 
     * @param id 品牌主键
     * @return 品牌
     */
    public Brand selectBrandById(Long id);

    /**
     * 查询品牌列表
     * 
     * @param brand 品牌
     * @return 品牌集合
     */
    public List<Brand> selectBrandList(Brand brand);

    /**
     * 新增品牌
     * 
     * @param brand 品牌
     * @return 结果
     */
    public int insertBrand(Brand brand);

    /**
     * 修改品牌
     * 
     * @param brand 品牌
     * @return 结果
     */
    public int updateBrand(Brand brand);

    /**
     * 删除品牌
     * 
     * @param id 品牌主键
     * @return 结果
     */
    public int deleteBrandById(Long id);

    /**
     * 批量删除品牌
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBrandByIds(Long[] ids);

    /**
     * 分页查询品牌列表
     *
     * param page             分页信息
     * @param brand 品牌信息
     * @return 品牌集合
     */
    public IPage<Brand> selectBrandPage(IPage<Brand> page, Brand brand);

}
