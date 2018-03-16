package com.bbp.common.repository;

import com.bbp.common.entity.search.Searchable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

/**
 * 包名：com.bbp.common.repository
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/28  0:26
 * <p>
 * 描述：<p>
 * 抽象DAO层基类 提供一些简便方法，具体使用请参考测试用例：{@see com.bbp.common.repository.UserRepository}<p>
 * 想要使用该接口需要在spring配置文件的jpa:repositories中添加<p>
 * factory-class="com.bbp.common.repository.support.SimpleBaseRepositoryFactoryBean"<p>
 * 泛型 ： M 表示实体类型；ID表示主键类型<p>
 *
 */
@NoRepositoryBean
public interface BaseRepository<M, ID extends Serializable> extends JpaRepository<M, ID> {

    /**
     * 根据主键删除
     *
     * @param ids
     */
    public void delete(ID[] ids);


    /**
     * (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#findAll()
     */
    @Override
    List<M> findAll();

    /**
     * (non-Javadoc)
     * @see org.springframework.data.repository.PagingAndSortingRepository#findAll(org.springframework.data.domain.Sort)
     */
    @Override
    List<M> findAll(Sort sort);


    /**
     * Returns a {@link Page} of entities meeting the paging restriction provided in the {@code Pageable} object.
     *
     * @param pageable
     * @return a page of entities
     */
    @Override
    Page<M> findAll(Pageable pageable);

    /**
     * 根据条件查询所有
     * 条件 + 分页 + 排序
     *
     * @param searchable
     * @return
     */
    public Page<M> findAll(Searchable searchable);


    /**
     * 根据条件统计所有记录数
     *
     * @param searchable
     * @return
     */
    public long count(Searchable searchable);

}
