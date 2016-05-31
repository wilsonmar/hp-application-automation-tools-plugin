package com.hp.nga.integrations.dto.stormRunner.impl;

import com.hp.nga.integrations.dto.stormRunner.TestCase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by lev on 31/05/2016.
 */
@XmlRootElement(name = "testcase")
@XmlAccessorType(XmlAccessType.NONE)
public class TestCaseImpl implements TestCase {
    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name = "time")
    private String time;

    @XmlAttribute(name = "status")
    private String status;

    @XmlAttribute(name = "classname")
    private String className;

    public String getTestName() {
        return name;
    }

    public TestCase setTestName(String name) {
        this.name = name;
        return this;
    }

    public String getTestTime() {
        return time;
    }

    public TestCase setTestTime(String time) {
        this.time = time;
        return this;
    }

    public String getTestStatus() {
        return status;
    }

    public TestCase setTestStatus(String status) {
        this.status = status;
        return this;
    }

    public String getTestClassName() {
        return className;
    }

    public TestCase setTestClassName(String className) {
        this.className = className;
        return this;
    }
}
