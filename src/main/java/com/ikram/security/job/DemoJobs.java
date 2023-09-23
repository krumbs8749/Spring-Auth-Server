package com.ikram.security.job;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ikram.security.job.Job;

public class DemoJobs {
    private final Job[] demoJobs;
    private static DemoJobs instance = null;

    public DemoJobs() {
        ObjectMapper objectMapper = new ObjectMapper();


        try {
            // JSON data provided directly in the code
            String jsonData = "[\n" +
                    "  {\n" +
                    "    \"job_title\": \"AI/ML Research Scientist\",\n" +
                    "    \"job_employer\": \"BMW Group\",\n" +
                    "    \"job_publisher\": \"LinkedIn Jobs\",\n" +
                    "    \"job_location\": \"Munich, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/bmw_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Ph.D. in Machine Learning or related field\",\n" +
                    "      \"Strong programming skills in Python\",\n" +
                    "      \"Experience with deep learning frameworks (e.g., TensorFlow, PyTorch)\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Conduct research in AI/ML algorithms\",\n" +
                    "      \"Develop and implement deep learning models using TensorFlow and PyTorch\",\n" +
                    "      \"Collaborate with cross-functional teams on AI projects\"\n" +
                    "    ],\n" +
                    "    \"description\": \"As an AI/ML Research Scientist at BMW Group, you will be at the forefront of innovation in artificial intelligence and machine learning. You will conduct research in cutting-edge AI algorithms, develop and implement complex deep learning models, and collaborate with multidisciplinary teams on exciting AI projects. Your work will play a crucial role in shaping the future of automotive technology.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Software Quality Assurance Engineer\",\n" +
                    "    \"job_employer\": \"Continental AG\",\n" +
                    "    \"job_publisher\": \"Glassdoor Jobs\",\n" +
                    "    \"job_location\": \"Hanover, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/continental_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Bachelor's degree in Computer Science or related field\",\n" +
                    "      \"ISTQB certification\",\n" +
                    "      \"Experience with test automation tools (e.g., Selenium)\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Create comprehensive test plans and test cases\",\n" +
                    "      \"Execute manual and automated tests using Selenium\",\n" +
                    "      \"Report and track software defects with attention to detail\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Join the Continental AG team as a Software Quality Assurance Engineer and play a crucial role in ensuring the quality and reliability of our software products. You will leverage your expertise in test automation tools and collaborate with development teams to deliver high-quality software solutions to our customers.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Blockchain Developer\",\n" +
                    "    \"job_employer\": \"SAP SE\",\n" +
                    "    \"job_publisher\": \"Indeed Jobs\",\n" +
                    "    \"job_location\": \"Berlin, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/sap_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Experience with blockchain development\",\n" +
                    "      \"Proficiency in Solidity\",\n" +
                    "      \"Knowledge of Ethereum smart contract development\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Design and implement blockchain solutions\",\n" +
                    "      \"Develop and deploy Ethereum smart contracts\",\n" +
                    "      \"Integrate blockchain technology into SAP solutions\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Join SAP SE as a Blockchain Developer and be part of our mission to revolutionize business processes through blockchain technology. You will leverage your expertise in Solidity and Ethereum smart contract development to design and implement innovative blockchain solutions that will transform industries.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Cloud DevOps Engineer\",\n" +
                    "    \"job_employer\": \"Siemens AG\",\n" +
                    "    \"job_publisher\": \"Monster Jobs\",\n" +
                    "    \"job_location\": \"Munich, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/siemens_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Strong knowledge of AWS, Docker, and Kubernetes\",\n" +
                    "      \"Experience with CI/CD pipelines\",\n" +
                    "      \"Scripting skills in Python or Shell\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Architect, implement, and manage AWS cloud infrastructure\",\n" +
                    "      \"Set up and maintain efficient CI/CD pipelines\",\n" +
                    "      \"Automate infrastructure provisioning and deployment tasks using scripting\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Siemens AG is looking for a Cloud DevOps Engineer to lead the transformation of our cloud infrastructure. You will be responsible for designing, implementing, and managing AWS-based solutions, setting up robust CI/CD pipelines, and automating deployment processes. Join us in shaping the future of cloud technology in the industrial sector.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Frontend UI Developer\",\n" +
                    "    \"job_employer\": \"Zalando SE\",\n" +
                    "    \"job_publisher\": \"CareerBuilder Jobs\",\n" +
                    "    \"job_location\": \"Berlin, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/zalando_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Proficiency in HTML, CSS, JavaScript\",\n" +
                    "      \"Experience with React or Angular frameworks\",\n" +
                    "      \"UI/UX design skills\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Develop visually appealing and user-friendly web interfaces\",\n" +
                    "      \"Collaborate closely with UX designers to implement designs\",\n" +
                    "      \"Optimize frontend performance and ensure cross-browser compatibility\"\n" +
                    "    ],\n" +
                    "    \"description\": \"As a Frontend UI Developer at Zalando SE, you will have the opportunity to create stunning and responsive user interfaces that enhance the online shopping experience. Your expertise in HTML, CSS, and JavaScript, coupled with UI/UX design skills, will contribute to making Zalando the fashion destination of choice.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Data Analyst\",\n" +
                    "    \"job_employer\": \"Volkswagen Group\",\n" +
                    "    \"job_publisher\": \"LinkedIn Jobs\",\n" +
                    "    \"job_location\": \"Wolfsburg, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/volkswagen_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Bachelor's or Master's degree in Data Science or related field\",\n" +
                    "      \"Proficiency in data analysis tools (e.g., Python, R)\",\n" +
                    "      \"Strong problem-solving skills\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Collect, clean, and analyze large datasets\",\n" +
                    "      \"Generate data insights and visualizations\",\n" +
                    "      \"Collaborate with data engineers on data pipelines\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Join Volkswagen Group as a Data Analyst and help us make data-driven decisions in the automotive industry. You will be responsible for collecting, cleaning, and analyzing large datasets, generating valuable insights, and collaborating with our data engineering team to ensure data availability and quality.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Embedded Systems Engineer\",\n" +
                    "    \"job_employer\": \"Bosch Group\",\n" +
                    "    \"job_publisher\": \"Glassdoor Jobs\",\n" +
                    "    \"job_location\": \"Stuttgart, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/bosch_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Experience in embedded systems programming\",\n" +
                    "      \"Proficiency in C/C++\",\n" +
                    "      \"Knowledge of real-time operating systems\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Design and develop embedded software for automotive applications\",\n" +
                    "      \"Optimize software for performance and resource utilization\",\n" +
                    "      \"Collaborate with hardware engineers on system integration\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Work on cutting-edge automotive technologies with our team. As an Embedded Systems Engineer at Bosch Group, you will design and develop embedded software for automotive applications, optimize software for performance, and collaborate with hardware engineers to integrate your solutions seamlessly.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Full Stack JavaScript Developer\",\n" +
                    "    \"job_employer\": \"Delivery Hero SE\",\n" +
                    "    \"job_publisher\": \"Indeed Jobs\",\n" +
                    "    \"job_location\": \"Berlin, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/delivery_hero_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Proficiency in JavaScript, Node.js\",\n" +
                    "      \"Experience with backend frameworks (e.g., Express)\",\n" +
                    "      \"Database skills (e.g., MongoDB)\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Develop frontend and backend components of web applications\",\n" +
                    "      \"Collaborate with product managers and designers\",\n" +
                    "      \"Implement RESTful APIs and database interactions\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Join our team to create the future of food delivery technology. As a Full Stack JavaScript Developer at Delivery Hero SE, you will develop both frontend and backend components of web applications. You'll work closely with product managers and designers to implement user-friendly interfaces and efficient RESTful APIs.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"UX Researcher\",\n" +
                    "    \"job_employer\": \"Siemens AG\",\n" +
                    "    \"job_publisher\": \"Monster Jobs\",\n" +
                    "    \"job_location\": \"Munich, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/siemens_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Background in human-computer interaction\",\n" +
                    "      \"Experience with user research methods\",\n" +
                    "      \"UX/UI design knowledge\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Plan and conduct user research studies\",\n" +
                    "      \"Analyze user behavior and provide insights\",\n" +
                    "      \"Collaborate with designers on improving user interfaces\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Shape the user experience of our products through research and insights. As a UX Researcher at Siemens AG, you will plan and conduct user research studies, analyze user behavior, and work closely with designers to enhance our product's user interfaces.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Big Data Engineer\",\n" +
                    "    \"job_employer\": \"SAP SE\",\n" +
                    "    \"job_publisher\": \"Glassdoor Jobs\",\n" +
                    "    \"job_location\": \"Berlin, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/sap_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Experience in big data technologies (e.g., Hadoop, Spark)\",\n" +
                    "      \"Proficiency in programming languages (e.g., Java, Scala)\",\n" +
                    "      \"Data modeling and ETL skills\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Design and build scalable data processing pipelines\",\n" +
                    "      \"Implement data transformations and ETL processes\",\n" +
                    "      \"Optimize data storage and retrieval\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Work with large datasets to drive data-driven decisions. As a Big Data Engineer at SAP SE, you will design and build scalable data processing pipelines, implement data transformations and ETL processes, and optimize data storage and retrieval for analytical insights.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Network Security Analyst\",\n" +
                    "    \"job_employer\": \"Continental AG\",\n" +
                    "    \"job_publisher\": \"LinkedIn Jobs\",\n" +
                    "    \"job_location\": \"Hanover, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/continental_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Knowledge of network security\",\n" +
                    "      \"Certifications (e.g., CISSP, CompTIA Security+)\",\n" +
                    "      \"Experience with security tools (e.g., IDS/IPS)\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Monitor network security for threats and vulnerabilities\",\n" +
                    "      \"Investigate security incidents and breaches\",\n" +
                    "      \"Implement security measures and policies\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Protect our organization from cyber threats and vulnerabilities. As a Network Security Analyst at Continental AG, you will monitor network security, investigate security incidents, and implement measures to safeguard our network infrastructure. Your expertise in network security will play a vital role in maintaining a secure environment.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"iOS App Developer\",\n" +
                    "    \"job_employer\": \"Volkswagen Group\",\n" +
                    "    \"job_publisher\": \"Indeed Jobs\",\n" +
                    "    \"job_location\": \"Wolfsburg, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/volkswagen_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Experience in iOS app development (Swift, Objective-C)\",\n" +
                    "      \"Familiarity with iOS development tools (Xcode)\",\n" +
                    "      \"Knowledge of design patterns\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Design and develop iOS applications for automotive use\",\n" +
                    "      \"Implement user interfaces and app functionality\",\n" +
                    "      \"Collaborate with cross-functional teams on app development\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Create innovative and user-friendly iOS apps for our vehicles. As an iOS App Developer at Volkswagen Group, you will design and develop iOS applications tailored for automotive use. Your contributions will enhance the digital experience of our customers while driving.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Cloud Solutions Architect\",\n" +
                    "    \"job_employer\": \"Daimler AG\",\n" +
                    "    \"job_publisher\": \"Monster Jobs\",\n" +
                    "    \"job_location\": \"Stuttgart, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/daimler_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Cloud architecture expertise\",\n" +
                    "      \"AWS or Azure certification\",\n" +
                    "      \"Experience with microservices architecture\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Design and implement cloud solutions for enterprise applications\",\n" +
                    "      \"Define cloud architecture best practices\",\n" +
                    "      \"Collaborate with development teams on cloud deployments\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Architect cloud solutions for the future of mobility and automotive technology. As a Cloud Solutions Architect at Daimler AG, you will design and implement cloud solutions for enterprise applications, define best practices for cloud architecture, and collaborate with development teams to ensure successful cloud deployments. Join us in shaping the future of mobility technology.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Python Developer\",\n" +
                    "    \"job_employer\": \"Zalando SE\",\n" +
                    "    \"job_publisher\": \"CareerBuilder Jobs\",\n" +
                    "    \"job_location\": \"Berlin, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/zalando_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Proficiency in Python\",\n" +
                    "      \"Experience with web frameworks (e.g., Django, Flask)\",\n" +
                    "      \"Database skills (e.g., SQL, NoSQL)\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Develop and maintain Python-based web applications\",\n" +
                    "      \"Collaborate with cross-functional teams on software projects\",\n" +
                    "      \"Optimize application performance and scalability\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Join Zalando SE as a Python Developer and contribute to building cutting-edge e-commerce solutions. You will develop and maintain Python-based web applications, collaborate with cross-functional teams on software projects, and optimize application performance and scalability. Your work will directly impact the online shopping experience.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"Marketing Manager\",\n" +
                    "    \"job_employer\": \"Volkswagen Group\",\n" +
                    "    \"job_publisher\": \"LinkedIn Jobs\",\n" +
                    "    \"job_location\": \"Wolfsburg, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/volkswagen_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Bachelor's or Master's degree in Marketing or related field\",\n" +
                    "      \"Experience in automotive or technology industry\",\n" +
                    "      \"Strong communication and leadership skills\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Develop and execute marketing strategies and campaigns\",\n" +
                    "      \"Analyze market trends and competitor activities\",\n" +
                    "      \"Lead a team of marketing professionals\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Drive the marketing efforts of Volkswagen Group and play a key role in shaping our brand's image. As a Marketing Manager, you will develop and execute marketing strategies and campaigns, analyze market trends and competitor activities, and lead a team of marketing professionals. Join us in defining the future of automotive marketing.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"HR Business Partner\",\n" +
                    "    \"job_employer\": \"Siemens AG\",\n" +
                    "    \"job_publisher\": \"Monster Jobs\",\n" +
                    "    \"job_location\": \"Munich, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/siemens_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Bachelor's or Master's degree in Human Resources\",\n" +
                    "      \"HR certification (e.g., SHRM, HRCI)\",\n" +
                    "      \"Experience in HR management and employee relations\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Serve as a strategic HR partner to business units\",\n" +
                    "      \"Manage HR operations and employee engagement\",\n" +
                    "      \"Provide guidance on HR policies and practices\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Join Siemens AG as an HR Business Partner and shape the future of HR within our organization. You will serve as a strategic HR partner to business units, manage HR operations and employee engagement, and provide guidance on HR policies and practices. Your contributions will drive our HR initiatives forward.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"UX Designer\",\n" +
                    "    \"job_employer\": \"Bosch Group\",\n" +
                    "    \"job_publisher\": \"Glassdoor Jobs\",\n" +
                    "    \"job_location\": \"Stuttgart, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/bosch_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Degree in Interaction Design or related field\",\n" +
                    "      \"Experience with UX design tools (e.g., Sketch, Adobe XD)\",\n" +
                    "      \"Strong portfolio showcasing user-centered design solutions\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Create intuitive and visually appealing user interfaces\",\n" +
                    "      \"Collaborate with cross-functional teams on design projects\",\n" +
                    "      \"Conduct user testing and gather feedback for design improvements\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Shape the user experience of our products at Bosch Group. As a UX Designer, you will create intuitive and visually appealing user interfaces, collaborate with cross-functional teams on design projects, and conduct user testing to gather feedback for design improvements. Your designs will have a direct impact on the usability and aesthetics of our products.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"job_title\": \"AI/ML Engineer\",\n" +
                    "    \"job_employer\": \"Daimler AG\",\n" +
                    "    \"job_publisher\": \"Indeed Jobs\",\n" +
                    "    \"job_location\": \"Stuttgart, Germany\",\n" +
                    "    \"employer_logo\": \"https://example.com/daimler_logo.png\",\n" +
                    "    \"qualifications\": [\n" +
                    "      \"Bachelor's or Master's degree in Computer Science or related field\",\n" +
                    "      \"Experience in AI and machine learning\",\n" +
                    "      \"Proficiency in programming languages (e.g., Python)\"\n" +
                    "    ],\n" +
                    "    \"responsibilities\": [\n" +
                    "      \"Develop and implement AI/ML algorithms\",\n" +
                    "      \"Collaborate with data scientists on model training\",\n" +
                    "      \"Integrate AI/ML solutions into automotive applications\"\n" +
                    "    ],\n" +
                    "    \"description\": \"Drive innovation in the automotive industry with your AI/ML expertise. As an AI/ML Engineer at Daimler AG, you will develop and implement AI/ML algorithms, collaborate with data scientists on model training, and integrate AI/ML solutions into automotive applications. Join us in shaping the future of mobility.\",\n" +
                    "    \"job_employment_type\": \"Full Time\"\n" +
                    "  }\n" +
                    "]";

            // Parse the JSON data into an array of Job objects
            demoJobs = objectMapper.readValue(jsonData, Job[].class);
            int id = 0;
            for(Job job : demoJobs){
                job.setId(id++);
            }
        } catch (Exception e) {
            // Handle parsing exceptions
            throw new RuntimeException("Error parsing JSON data", e);
        }
    }
    public static DemoJobs getInstance() {
        if (instance == null) {
            synchronized (DemoJobs.class) {
                if (instance == null) {
                    instance = new DemoJobs();
                }
            }
        }
        return instance;
    }
    public Job[] getDemoJobs() {
        return demoJobs;
    }

}
