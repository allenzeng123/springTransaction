package laobi.git.springTransaction.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import laobi.git.springTransaction.entity.Persion;

@Repository
public class PersionDao {//from5 501

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	public Persion load(Integer id) {
		return (Persion) this.getCurrentSession().load(Persion.class, id);
	}

	public Persion get(Integer id) {
		return (Persion) this.getCurrentSession().get(Persion.class, id);
	}

	@SuppressWarnings("unchecked")

	public List<Persion> findAll() {
		List<Persion> Persions = this.getCurrentSession().createQuery("from Persion").list();
		return Persions;
	}

	public void persist(Persion entity) {
		this.getCurrentSession().persist(entity);

	}

	public Integer save(Persion entity) {
		return (Integer) this.getCurrentSession().save(entity);
	}

	public void saveOrUpdate(Persion entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	public void delete(Integer id) {
		Persion entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	public void flush() {
		this.getCurrentSession().flush();

	}
}
