package org.uengine.five;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.uengine.kernel.ActivityFilter;
import org.uengine.kernel.ProcessDefinition;
import org.uengine.kernel.ProcessInstance;
import org.uengine.modeling.resource.CachedResourceManager;
import org.uengine.modeling.resource.ResourceManager;
import org.uengine.modeling.resource.Storage;
import org.uengine.social.entity.ProcessInstanceEntity;
import org.uengine.social.repository.ProcessInstanceRepository;
import org.uengine.social.service.DefinitionService;

import javax.servlet.Filter;
import java.util.Map;

@EnableWebMvc
@Configuration
public class WebConfig extends org.uengine.social.uEngine5WebConfig {


    /**
     * Uncomment and implement if you want to change default storage
     */

//    @Bean
//    @Override
//    public Storage storage() {
//        CLOBStorage storage = new CLOBStorage();
//        storage.setDatasource(super.dataSource());
//        storage.setTableName("bpm_def");
//
//        return storage;
//    }


    /**
     * Uncomment and add ActivityFilters like following example
     */
//    @Bean
//    public ActivityFilter exampleActivityFilter1() {
//        return new ExampleActivityFilter1();
//    }
//
//    @Bean
//    public ActivityFilter exampleActivityFilter2() {
//        return new ExampleActivityFilter2();
//    }
//

    /**
     * Uncomment and return an implementation of ProcessInstance. default is JPAProcessInstance
     */
//    @Bean
//    @Scope("prototype")
//    @Override
//    public ProcessInstance processInstance(ProcessDefinition procDefinition, String instanceId, Map options) throws Exception {
//        return new CustomProcessInstance(procDefinition, instanceId, options);
//    }



}


