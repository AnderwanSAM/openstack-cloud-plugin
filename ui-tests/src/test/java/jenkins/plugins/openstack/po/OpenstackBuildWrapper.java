/*
 * The MIT License
 *
 * Copyright (c) 2015 Red Hat, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package jenkins.plugins.openstack.po;

import org.jenkinsci.test.acceptance.po.BuildWrapper;
import org.jenkinsci.test.acceptance.po.Job;

public class OpenstackBuildWrapper extends BuildWrapper {

    public OpenstackBuildWrapper(Job context) {
        super(context, "/jenkins-plugins-openstack-compute-JCloudsBuildWrapper");
    }

    public void cloud(String name) {
        control("instancesToRun/cloudName").select(name);
    }

    public void template(String name) {
        control("instancesToRun/useSelectTemplates[false]").check();
        control("instancesToRun/manualTemplateName").set(name);
    }

    public void count(int count) {
        control("instancesToRun/count").set(count);
    }
}
