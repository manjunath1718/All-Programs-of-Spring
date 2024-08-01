package com.telusko.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.dao.JobSeeker;
import com.telusko.dao.JobSeekerRepo;

@Service
public class JobSeekerService implements IJobSeekeerService {

	@Autowired
	JobSeekerRepo repo;
	
	@Override
	public String registerJobSeeker(JobSeeker jobSeeker) {
		
		return "Job Seeker Info stored with id "+repo.save(jobSeeker).getId();
	}

	@Override
	public Optional<JobSeeker> fetchJobSeekeerById(Integer id) {
		
		return repo.findById(id);
	}

}
