package com.orient.sysmodel.domain.user;
// default package

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for RcpLogin entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .RcpLogin
  * @author MyEclipse Persistence Tools 
 */

public class RcpLoginDAO extends HibernateDaoSupport  {
    private static final Log log = LogFactory.getLog(RcpLoginDAO.class);
	//property constants



    
    public void save(RcpLogin transientInstance) {
        log.debug("saving RcpLogin instance");
        try {
        	getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(RcpLogin persistentInstance) {
        log.debug("deleting RcpLogin instance");
        try {
        	getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public RcpLogin findById( RcpLoginId id) {
        log.debug("getting RcpLogin instance with id: " + id);
        try {
            RcpLogin instance = (RcpLogin) getHibernateTemplate()
                    .get("com.orient.sysmodel.domain.user.RcpLogin", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(RcpLogin instance) {
        log.debug("finding RcpLogin instance by example");
        try {
        	List results = getHibernateTemplate().findByExample(instance);
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding RcpLogin instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from RcpLogin as model where model." 
         						+ propertyName + "= ?";
         return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all RcpLogin instances");
		try {
			String queryString = "from RcpLogin";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public RcpLogin merge(RcpLogin detachedInstance) {
        log.debug("merging RcpLogin instance");
        try {
            RcpLogin result = (RcpLogin) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(RcpLogin instance) {
        log.debug("attaching dirty RcpLogin instance");
        try {
        	getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(RcpLogin instance) {
        log.debug("attaching clean RcpLogin instance");
        try {
        	getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}