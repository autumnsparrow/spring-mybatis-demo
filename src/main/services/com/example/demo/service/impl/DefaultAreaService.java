/**
 * 
 */
package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.db.domain.SkyArea;
import com.example.demo.db.persistence.SkyAreaMapper;
import com.example.demo.service.IAreaService;

/**
 * @author sparrow
 *
 */
@Service
public class DefaultAreaService implements IAreaService {
	
	@Autowired
	SkyAreaMapper skyAreaMapper;

	/* (non-Javadoc)
	 * @see com.example.demo.service.IAreaService#getAreaNames()
	 */
	@Transactional
	public List<String> getAreaNames() {
		// TODO Auto-generated method stub
		List<String> names= skyAreaMapper.selectAll().stream().map(area->area.getAreaname()).
				collect(Collectors.toList());
		return names;
	}

}
