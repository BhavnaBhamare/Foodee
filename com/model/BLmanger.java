package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Addhotel;
import com.pojo.Nvegbiryanees;
import com.pojo.Nvegchickenmaincourse;
import com.pojo.Nvegeggmaincourse;
import com.pojo.Nvegmenu;
import com.pojo.Nvegmuttonmaincourse;
import com.pojo.Nvegstarter;
import com.pojo.Registration;
import com.pojo.Role;
import com.pojo.Roti;
import com.pojo.Sweets;
import com.pojo.Vegmenu;
import com.pojo.Vegrice;
import com.pojo.Vegsabji;
import com.pojo.Vegstarter;

public class BLmanger {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public void Register(Registration r) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(r);
		transaction.commit();
		session.close();

	}

	public Role searchbyid(String rolltype) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Role.class);
		criteria.add(Restrictions.eq("rolltype", rolltype));
		Role ro = (Role) criteria.uniqueResult();
		session.close();
		return ro;
	}

	public Registration searchbyrollid(String emailid) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Registration.class);
		criteria.add(Restrictions.eq("emailid", emailid));
		Registration ro = (Registration) criteria.uniqueResult();
		return ro;
	}

	public Boolean searchemailpasswordforuser(String emailid, String password) {
		Registration r = searchbyepforuser(emailid, password);

		if (r != null && r.getEmailid().equals(emailid) && r.getPassword().equals(password)) {
			return true;
		} else {
			return null;
		}
	}

	private Registration searchbyepforuser(String emailid, String password) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Registration.class);
		criteria.add(Restrictions.eq("emailid", emailid));
		criteria.add(Restrictions.eq("password", password));
		Registration ro = (Registration) criteria.uniqueResult();
		return ro;

	}

	public Boolean searchemailpasswordforhowner(String emailid, String password) {
		Registration r = searchbyepforhowner(emailid, password);
		if (r != null && r.getEmailid().equals(emailid) && r.getPassword().equals(password)) {
			return true;
		} else {
			return null;
		}
	}

	private Registration searchbyepforhowner(String emailid, String password) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Registration.class);
		criteria.add(Restrictions.eq("emailid", emailid));
		criteria.add(Restrictions.eq("password", password));
		Registration ro = (Registration) criteria.uniqueResult();
		return ro;
	}

	public Registration searchId(String str) {

		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Registration.class);
		criteria.add(Restrictions.eq("firstname", str));
		Registration r2 = (Registration) criteria.uniqueResult();

		return r2;
	}

	public void hoteldays(Addhotel h) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(h);
		transaction.commit();
		session.close();

	}

	public void savevegstater(Vegstarter st) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(st);
		transaction.commit();
		session.close();

	}

	public void saveveroti(Roti rt) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(rt);
		transaction.commit();
		session.close();

	}

	public void savesabji(Vegsabji sb) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(sb);
		transaction.commit();
		session.close();

	}

	public void saveverice(Vegrice ri) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ri);
		transaction.commit();
		session.close();
	}

	public void savesweet(Sweets sw) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(sw);
		transaction.commit();
		session.close();
	}

	public void savenvegstater(Nvegstarter st1) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(st1);
		transaction.commit();
		session.close();

	}

	public void saaveegg(Nvegeggmaincourse egg) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(egg);
		transaction.commit();
		session.close();

	}

	public void savechicken(Nvegchickenmaincourse ch) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ch);
		transaction.commit();
		session.close();

	}

	public void savemutton(Nvegmuttonmaincourse mu) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(mu);
		transaction.commit();
		session.close();

	}

	public void savebiryanee(Nvegbiryanees bir) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(bir);
		transaction.commit();
		session.close();
	}

	public Addhotel searchbyId(String str1) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Addhotel.class);
		criteria.add(Restrictions.eq("hotelname", str1));
		Addhotel h1 = (Addhotel) criteria.uniqueResult();

		return h1;
	}

	public List<Vegstarter> searchlist() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vegstarter.class);
		List<Vegstarter> s = criteria.list();
		return s;
	}

	public Boolean searchemailpasswordforadmin(String emailid, String password) {

		Registration r = searchbyepforadmin(emailid, password);
		if (r != null && r.getEmailid().equals(emailid) && r.getPassword().equals(password)) {
			return true;
		} else {
			return null;
		}
	}

	private Registration searchbyepforadmin(String emailid, String password) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Registration.class);
		criteria.add(Restrictions.eq("emailid", emailid));
		criteria.add(Restrictions.eq("password", password));
		Registration ro = (Registration) criteria.uniqueResult();
		return ro;
	}

	public void savevegmenu(Vegmenu ve) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ve);
		transaction.commit();
		session.close();

	}

	public List<Addhotel> searchhotellist() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Addhotel.class);
		List<Addhotel> s1 = criteria.list();
		return s1;
	}

	public Vegstarter searchvegstarterid(String vegstatermenutype) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vegstarter.class);
		criteria.add(Restrictions.eq("vegstatermenutype", vegstatermenutype));
		Vegstarter st = (Vegstarter) criteria.uniqueResult();

		return st;
	}

	public Vegrice searchvegricebyid(String vegmenutype) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vegrice.class);
		criteria.add(Restrictions.eq("vegmenutype", vegmenutype));
		Vegrice ri = (Vegrice) criteria.uniqueResult();

		return ri;
	}

	public Vegsabji searchvegsbjibyid(String sabjimenutype) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vegsabji.class);
		criteria.add(Restrictions.eq("sabjimenutype", sabjimenutype));
		Vegsabji sb = (Vegsabji) criteria.uniqueResult();

		return sb;
	}

	public Roti searchrotibyid(String roticategory) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Roti.class);
		criteria.add(Restrictions.eq("roticategory", roticategory));
		Roti rt = (Roti) criteria.uniqueResult();

		return rt;
	}

	public Sweets searchsweetbyid(String sweetmenutype) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Sweets.class);
		criteria.add(Restrictions.eq("sweetmenutype", sweetmenutype));
		Sweets sw = (Sweets) criteria.uniqueResult();

		return sw;
	}

	public Nvegstarter seachnonstater(String nvegstartermenutype) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Nvegstarter.class);
		criteria.add(Restrictions.eq("nvegstartermenutype", nvegstartermenutype));
		Nvegstarter str1 = (Nvegstarter) criteria.uniqueResult();

		return str1;
	}

	public Nvegeggmaincourse sercheggbyid(String eggmenutype) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Nvegeggmaincourse.class);
		criteria.add(Restrictions.eq("eggmenutype", eggmenutype));
		Nvegeggmaincourse egg = (Nvegeggmaincourse) criteria.uniqueResult();

		return egg;
	}

	public Nvegchickenmaincourse searchchickenbyid(String chickenmenutype) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Nvegchickenmaincourse.class);
		criteria.add(Restrictions.eq("chickenmenutype", chickenmenutype));
		Nvegchickenmaincourse ch = (Nvegchickenmaincourse) criteria.uniqueResult();

		return ch;
	}

	public Nvegmuttonmaincourse searchmuttonid(String muttonmenutype) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Nvegmuttonmaincourse.class);
		criteria.add(Restrictions.eq("muttonmenutype", muttonmenutype));
		Nvegmuttonmaincourse mu = (Nvegmuttonmaincourse) criteria.uniqueResult();

		return mu;
	}

	public Nvegbiryanees searchbirid(String biryaneemenutype) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Nvegbiryanees.class);
		criteria.add(Restrictions.eq("biryaneemenutype", biryaneemenutype));
		Nvegbiryanees bir = (Nvegbiryanees) criteria.uniqueResult();

		return bir;
	}

	public void savenonvegdata(Nvegmenu non) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(non);
		transaction.commit();
		session.close();
	}

	public Addhotel searchhotel(String hotelname) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Addhotel.class);
		criteria.add(Restrictions.eq("hotelname", hotelname));
		Addhotel h1 = (Addhotel) criteria.uniqueResult();

		return h1;
	}

	public List<Vegmenu> searchvegmenu(Addhotel h) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vegmenu.class);
		criteria.add(Restrictions.eq("addhotel", h));
		List<Vegmenu> veg = criteria.list();

		return veg;
	}

	public Vegmenu searchhotal(String hotelname) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Vegmenu.class);
		criteria.add(Restrictions.eq("hotelname", hotelname));
		Vegmenu ve = (Vegmenu) criteria.uniqueResult();

		return ve;
	}

	public List<Nvegmenu> searchnonvegmenu(Addhotel h) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Nvegmenu.class);
		criteria.add(Restrictions.eq("addhotel", h));
		List<Nvegmenu> nonveg = criteria.list();

		return nonveg;
	}

	public List<Registration> searchreglist() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Registration.class);
		List<Registration> k = criteria.list();

		return k;
	}

	
	
	public void updateuserprofile(Registration r) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(r);
		transaction.commit();
		session.close();

	}

	public Registration searchuserp(String emailid) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Registration.class);
		criteria.add(Restrictions.eq("emailid", emailid));
		Registration r1 = (Registration) criteria.uniqueResult();

		return r1;
	}

	public Role searchroleid2(String user) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Role.class);
		criteria.add(Restrictions.eq("rolltype", user));
		Role r2 = (Role) criteria.uniqueResult();

		return r2;

	}

	public List<Registration> searchuser(Role role2) {
		
			Session session = factory.openSession();
			Criteria criteria = session.createCriteria(Registration.class);
			criteria.add(Restrictions.eq("role", role2));
			List<Registration> r = criteria.list();

			return r;
	}

}
