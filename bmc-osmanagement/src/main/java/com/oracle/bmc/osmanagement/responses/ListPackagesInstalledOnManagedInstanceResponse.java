/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.osmanagement.responses;

import com.oracle.bmc.osmanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListPackagesInstalledOnManagedInstanceResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of `InstalledPackageSummary`s. If this
     * header appears in the response, then this is a partial list of
     * `InstalledPackageSummary`s for the managed instance. Include
     * this value as the `page` parameter in a subsequent GET request
     * to get the next batch of managed instances.
     *
     */
    private String opcNextPage;

    /**
     * A list of InstalledPackageSummary instances.
     */
    private java.util.List<InstalledPackageSummary> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListPackagesInstalledOnManagedInstanceResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }
    }
}
