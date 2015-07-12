package net.cho.web.dao;

import java.util.List;

import net.cho.web.model.GuestDTO;

public interface GuestDAO {
	/*
	 * �������̽��� �ü� �ִ°���
	 * 1. public static final�� ����� Ŭ������ �ٷ� ���� ������ ���� �����
	 * �ü� �ִ�. ����� ���� ������ �� ���.
	 * 2. �߻�޼��常 �ü� �ִ�. 
	 */
	void insertGuest(GuestDTO g); //���� ����
	//public abstract�� ���. �߻�޼���
	List<GuestDTO> getGuestList();//���� ���
	int listCount();                 //�� ���ڵ� ����
	GuestDTO getGuestCont(int no);//���� ����
	void guestEdit(GuestDTO eg);  //���� ����
	void deleteGuest(int no);        //���� ����
}
