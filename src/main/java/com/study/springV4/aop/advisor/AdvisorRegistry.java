package com.study.springV4.aop.advisor;

import java.util.List;

/*

 */
public interface AdvisorRegistry {
     void registAdvisor(Advisor ad);

     List<Advisor> getAdvisors();

}
