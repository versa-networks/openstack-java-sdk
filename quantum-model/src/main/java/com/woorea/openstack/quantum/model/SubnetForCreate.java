package com.woorea.openstack.quantum.model;

import java.io.Serializable;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonRootName("subnet")

public class SubnetForCreate implements Serializable{
	
	private String name;
	@JsonProperty("network_id")
	private String networkId;
	@JsonProperty("ip_version")
	private int ipVersion;
	private String cidr;
	@JsonProperty("allocation_pools")
	private List<Pool> list;
    @JsonProperty("tenant_id")
    private String tenantId;
	//GDM added
	@JsonProperty("enable_dhcp")
	private boolean enableDHCP;
	@JsonProperty("gateway_ip")
	@JsonSerialize(include=Inclusion.NON_DEFAULT)
	private String gatewayIp = "";
		
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the id
	 */
	public String getNetworkId() {
		return networkId;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setNetworkId(String id) {
		this.networkId = id;
	}
	
	
	/**
	 * @return the ipVersion
	 */
	public int getIpVersion() {
		return ipVersion;
	}

	/**
	 * @param ipVersion the ipVersion to set
	 */
	public void setIpVersion(int ipVersion) {
		this.ipVersion = ipVersion;
	}

	/**
	 * @return the cidr
	 */
	public String getCidr() {
		return cidr;
	}
	
	/**
	 * @param cidr the cidr to set
	 */
	public void setCidr(String cidr) {
		this.cidr = cidr;
	}
	
	/**
	 * @return the list
	 */
	public List<Pool> getList() {
		return list;
	}
	
	/**
	 * @param list the list to set
	 */
	public void setList(List<Pool> list) {
		this.list = list;
	}

    /**
     * @return the tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * @param tenantId the tenantId to set
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * GDM
     */
	public boolean isEnableDHCP() {
		return enableDHCP;
	}

	public void setEnableDHCP(boolean enableDHCP) {
		this.enableDHCP = enableDHCP;
	}

	public String getGatewayIp() {
		return gatewayIp;
	}

	public void setGatewayIp(String gatewayIp) {
		this.gatewayIp = gatewayIp;
	}

	
	
}
