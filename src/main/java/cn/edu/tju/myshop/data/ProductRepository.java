/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.edu.tju.myshop.data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.List;

import cn.edu.tju.myshop.model.Product;

@ApplicationScoped
public class ProductRepository {

    @Inject
    private EntityManager em;

    public Product findById(int id) {
        return em.find(Product.class, id);
    }
    
    public List<Product> findAllOrderedById() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Product> criteria = cb.createQuery(Product.class);
        Root<Product> product = criteria.from(Product.class);
        criteria.select(product).orderBy(cb.asc(product.get("id")));
        return em.createQuery(criteria).getResultList();
    }
    
    public void add(Product product) {
        em.persist(product);
    }
    
    public void delete(int id) {
    	Product product = findById(id);
    	em.remove(product);
    }
    
    public void update(Product product) {
    	em.merge(product);
    }
    
    public List<Product> search(String keyword) {
    	return em.createQuery(
    			"SELECT p FROM Product p WHERE p.name LIKE :keyword OR p.summary LIKE :keyword OR p.detail LIKE :keyword", Product.class)
    			.setParameter("keyword", "%" + keyword + "%")
    			.getResultList();
    }
    
}
