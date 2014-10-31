/**
 * Copyright (c) 2014 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package com.baidu.rigel.biplatform.ac.query.model;

import java.io.Serializable;

/**
 * sort info
 * 
 * @author chenxiaoming01
 *
 */
public class SortRecord implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -88538692970583250L;
    
    /**
     * sortType 排序方式
     */
    private SortType sortType = SortType.NONE;
    
    /**
     * sortColumnUniquename 排序的列的UniqueName
     */
    private String sortColumnUniquename;
    
    public enum SortType {
        /**
         * NONE 不排序
         */
        NONE,
        /**
         * ASC 升序
         */
        ASC,
        /**
         * DESC 降序
         */
        DESC
    }
    
    /**
     * getter method for property sortType
     * 
     * @return the sortType
     */
    public SortType getSortType() {
        return sortType;
    }
    
    /**
     * setter method for property sortType
     * 
     * @param sortType the sortType to set
     */
    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }
    
    /**
     * getter method for property sortColumnUniquename
     * 
     * @return the sortColumnUniquename
     */
    public String getSortColumnUniquename() {
        return sortColumnUniquename;
    }
    
    /**
     * setter method for property sortColumnUniquename
     * 
     * @param sortColumnUniquename the sortColumnUniquename to set
     */
    public void setSortColumnUniquename(String sortColumnUniquename) {
        this.sortColumnUniquename = sortColumnUniquename;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "SortRecord [sortType=" + sortType + ", sortColumnUniquename="
            + sortColumnUniquename + "]";
    }
    
}
