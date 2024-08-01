package com.telusko.service;

import java.util.Optional;

import com.telusko.dao.JobSeeker;

public interface IJobSeekeerService {

	public String registerJobSeeker(JobSeeker jobSeeker);
	public Optional<JobSeeker> fetchJobSeekeerById(Integer id);
}
