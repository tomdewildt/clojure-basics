(ns basics.agents)

(defn main
  []
  ;; Define agent variable
  (def agent-variable (agent 0))

  ;; Increment agent
  (send agent-variable + 15)

  ;; Await for agent update
  (await-for 100 agent-variable)

  ;; Value of agent
  (println "Value of agent: " @agent-variable)

  ;; Shutdown agents
  (shutdown-agents))
