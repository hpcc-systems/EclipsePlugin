/**
 * WsSMCServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wssmc;

public interface WsSMCServiceSoap extends java.rmi.Remote {
    public ActivityResponse activity(Activity parameters) throws java.rmi.RemoteException, ArrayOfEspException;
    public BrowseResourcesResponse browseResources() throws java.rmi.RemoteException, ArrayOfEspException;
    public SMCQueueResponse clearQueue(ClearQueue parameters) throws java.rmi.RemoteException, ArrayOfEspException;
    public GetThorQueueAvailabilityResponse getThorQueueAvailability() throws java.rmi.RemoteException, ArrayOfEspException;
    public SMCIndexResponse index() throws java.rmi.RemoteException, ArrayOfEspException;
    public SMCJobResponse moveJobBack(MoveJobBack parameters) throws java.rmi.RemoteException, ArrayOfEspException;
    public SMCJobResponse moveJobDown(MoveJobDown parameters) throws java.rmi.RemoteException, ArrayOfEspException;
    public SMCJobResponse moveJobFront(MoveJobFront parameters) throws java.rmi.RemoteException, ArrayOfEspException;
    public SMCJobResponse moveJobUp(MoveJobUp parameters) throws java.rmi.RemoteException, ArrayOfEspException;
    public NotInCommunityEditionResponse notInCommunityEdition(NotInCommunityEdition parameters) throws java.rmi.RemoteException, ArrayOfEspException;
    public SMCQueueResponse pauseQueue(PauseQueue parameters) throws java.rmi.RemoteException, ArrayOfEspException;
    public SMCJobResponse removeJob(RemoveJob parameters) throws java.rmi.RemoteException, ArrayOfEspException;
    public SMCQueueResponse resumeQueue(ResumeQueue parameters) throws java.rmi.RemoteException, ArrayOfEspException;
    public SetBannerResponse setBanner(SetBanner parameters) throws java.rmi.RemoteException, ArrayOfEspException;
    public SMCPriorityResponse setJobPriority(SetJobPriority parameters) throws java.rmi.RemoteException, ArrayOfEspException;
    public SMCQueueResponse stopQueue(StopQueue parameters) throws java.rmi.RemoteException, ArrayOfEspException;
}
