package org.thinker.txex.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.thinker.txex.mapper.TxExMapper;


//���񽺿��� �̷� ����� �´�. ������ ������̼��� �ɰ� �ʹٸ� root-context.xml�� �߰������� �ʿ��ϴ�.
@Service
//@Transactional
public class TxExService {

	@Inject
	TxExMapper mapper;
	
	@Transactional(propagation=Propagation.REQUIRED) //�޼ҵ� ������ Ʈ����� ó���ϰ� ������.
	public void addData(String codeValue, String strValue)throws Exception{
		
		mapper.insertMain(codeValue);
		
		mapper.insertSub(strValue);
		
	}
	
	public void updateData(Integer num, String value)throws Exception{
		
		
		mapper.insertMain(value);
		
		mapper.update1(num, value);
		
		
	}
	
	
	
}
