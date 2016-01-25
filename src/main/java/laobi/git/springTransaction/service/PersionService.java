package laobi.git.springTransaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import laobi.git.springTransaction.dao.PersionDao;
import laobi.git.springTransaction.entity.Persion;

@Service
public class PersionService {

	@Autowired
	private PersionDao persionDao;

	public Persion load(Integer id) {
		return null;
	}

	public Persion get(Integer id) {
		return persionDao.get(id);
	}

	public List<Persion> findAll() {
		return persionDao.findAll();
	}

	public void persist(Persion entity) {
		persionDao.persist(entity);
	}

	public Integer save(Persion entity) {
		return persionDao.save(entity);
	}

	public void saveOrUpdate(Persion entity) {
		persionDao.saveOrUpdate(entity);
	}

	public void delete(Integer id) {
		persionDao.delete(id);
	}

	public void flush() {
		persionDao.flush();
	}

	public void insert(Persion entity) throws Exception {
		Persion p = new Persion();
		p.setName("jack");
		p.setAge(18);
		persionDao.saveOrUpdate(p);

		int i = 10 / 0;
//		testPersion(entity);
//		try {
//			testPersion(entity);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
	}

	public void testPersion(Persion entity) {
		Persion p = new Persion();
		p.setName("tom");
		p.setAge(20);
		persionDao.saveOrUpdate(p);

		int i = 10 / 0;
		// throw new Exception();

	}

	public static void main(String[] args) throws Exception {
		String[] configLocations = new String[] { "spring.xml", "spring-hibernate.xml" };
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocations);
		PersionService ps = ctx.getBean(PersionService.class);

		Persion p = new Persion();
		p.setName("jack");
		p.setAge(118);

		ps.insert(p);
		// ps.test(p);
		System.out.println("OK!!!");
	}
}
